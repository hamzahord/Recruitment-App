import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { tick } from '@angular/core/testing';
import { NgForm } from '@angular/forms';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Candidate } from '../model/candidate';
import { CandidateService } from '../service/candidate.service';

@Component({
  selector: 'app-all-cand',
  templateUrl: './all-cand.component.html',
  styleUrls: ['./all-cand.component.css']
})
export class AllCandComponent implements OnInit {

  candidates!: Candidate[];
  closeResult!: string;

  constructor(
    private candidateService: CandidateService,
    private modalService: NgbModal,
    private httpClient: HttpClient
  ) { }

  ngOnInit(): void {
    this.candidateService.getCandidates().subscribe(response => this.handleSuccessfulResponse(response),);
  }

  handleSuccessfulResponse(response){
    this.candidates = response;
  }

  open(content) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

  onSubmit(f: NgForm) {
    const url = 'http://localhost:8080/addcand';
    this.httpClient.post(url, f.value)
    .subscribe((result) => {
      this.candidateService.getCandidates; //reload the table
    })
    this.modalService.dismissAll(); //dismiss the modal
  }
  
}

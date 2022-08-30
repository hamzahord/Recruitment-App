import { Component, OnInit } from '@angular/core';
import { Candidate } from '../model/candidate';
import { Cv } from '../model/cv';
import { CvService } from '../service/cv.service';

@Component({
  selector: 'app-all-cv',
  templateUrl: './all-cv.component.html',
  styleUrls: ['./all-cv.component.css']
})
export class AllCVComponent implements OnInit {

  candidates!: Candidate[];
  constructor(
    private cvService: CvService
  ) { }

  ngOnInit(): void {
    this.cvService.getNullCandidates().subscribe(response => this.handleSuccessfulResponse(response),);
  }

  handleSuccessfulResponse(response){
    this.candidates = response;
  }

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable } from 'rxjs';
import { Candidate } from '../model/candidate';

@Injectable({
  providedIn: 'root'
})
export class CandidateService {

  private baseUrl = "http://localhost:8080/getcand";

  constructor(
    private httpClient: HttpClient
  ) { }

  getCandidates(): Observable<Candidate[]>{
    return this.httpClient.get<Candidate[]>(`${this.baseUrl}`);
  }

  onSubmit1(f: NgForm) {
    const url = 'http://localhost:8080/addcand';
    this.httpClient.post(url, f.value);
  }

}

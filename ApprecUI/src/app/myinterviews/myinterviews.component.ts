import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginComponent } from '../login/login.component';
import { Interview } from '../model/interview';
import { InterviewService } from '../service/interview.service';

@Component({
  selector: 'app-myinterviews',
  templateUrl: './myinterviews.component.html',
  styleUrls: ['./myinterviews.component.css']
})
export class MyinterviewsComponent implements OnInit {

  interviews!: Interview[];
  constructor(
    private interviewService: InterviewService
      ) { }

  ngOnInit(): void {
    this.interviewService.getInterviews();
  }

  handleSuccessfulResponse(response){
    this.interviews = response;
  }

}

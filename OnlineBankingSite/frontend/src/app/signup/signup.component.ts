import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit{

  public signUpForm : FormGroup;
  constructor(private formBuilder : FormBuilder, private route : Router) {}

  ngOnInit(): void {
    this.signUpForm = this.formBuilder.group({
      userName : [''],
      emailId : [''],
      password : [''],
      mobile : ['']
    });
  }

  signUp(){
    console.log("Values", this.signUpForm.value);
    this.signUpForm.reset();
    this.route.navigate(['login'])
  }

}

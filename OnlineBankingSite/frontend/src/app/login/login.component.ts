import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms'


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginForm : FormGroup;

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit() : void{
    this.loginForm = this.formBuilder.group({
      emailId : [''],
      password : ['']
    })
  }

  


  onLogin() {
    console.log("Hello", this.loginForm.value);
    this.loginForm.reset();
  }

}
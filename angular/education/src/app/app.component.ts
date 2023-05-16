import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'education';

  hideWhen: Array<string> = ['/login', '/register', '/home'];
  // put all the route names where you want it hidden in above array

  constructor(private _router:Router) {}
 

  shouldShowTopbar() {
    // console.log(this._router.routerState.snapshot.url)
    // console.log(this.hideWhen.indexOf(this._router.routerState.snapshot.url) > -1)
    return (this.hideWhen.indexOf(this._router.routerState.snapshot.url) > -1);
  }
}

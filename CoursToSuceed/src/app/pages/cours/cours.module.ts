import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CoursRoutingModule } from './cours-routing.module';
import { CoursComponent } from './cours.component';
import { CoursDetailComponent } from './cours-detail/cours-detail.component';
import { CoursListComponent } from './cours-list/cours-list.component';


@NgModule({
  declarations: [
    CoursComponent,
    CoursDetailComponent,
    CoursListComponent
  ],
  imports: [
    CommonModule,
    CoursRoutingModule
  ]
})
export class CoursModule { }

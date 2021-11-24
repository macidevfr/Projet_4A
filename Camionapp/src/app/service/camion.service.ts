import { HttpClient, HttpErrorResponse, HttpStatusCode } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, tap, throwError } from 'rxjs';
import { Types_U } from '../enum/type_User.enum';
import { Camion } from '../interface/camion';
import { CustomResponse } from '../interface/custom-response';

@Injectable({providedIn: 'root'})
export class CamionService {
  private readonly apiUrl = 'http://localhost:9292';

  constructor(private http: HttpClient) { }

  // getCamions(): Observable<CustomResponse>{
  //   return this.http.get<CustomResponse>('http://localhost:9292/logistique/list')
  // }
camions$ = <Observable<CustomResponse>>
this.http.get<CustomResponse>(`${this.apiUrl}/logistique/list`)
.pipe(
  tap(console.log),
  catchError(this.handleError)
);

save$ = (camion: Camion) => <Observable<CustomResponse>>
this.http.post<CustomResponse>('${this.apiUrl}/logistique/save', camion)
.pipe(
  tap(console.log),
  catchError(this.handleError)
);

delete$ = (camionId: number) => <Observable<CustomResponse>>
this.http.delete<CustomResponse>(`${this.apiUrl}/logistique/delete/${camionId}`)
.pipe(
  tap(console.log),
  catchError(this.handleError)
);

// filter$ = (type: Types_U, response: CustomResponse) => <Observable<CustomResponse>>
// new Observable<CustomResponse>(
//   subscriber => {
//     console.log(response);
//     subscriber.next(
//       sta
//     )

//   })
// .pipe(
//   tap(console.log),
//   catchError(this.handleError)
// );


private handleError(error: HttpErrorResponse): Observable<never> {
  console.log(error);
  return throwError (`An error occured - Error code : ${error.status}`); 
}

}

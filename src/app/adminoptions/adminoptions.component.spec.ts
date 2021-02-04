import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminoptionsComponent } from './adminoptions.component';

describe('AdminoptionsComponent', () => {
  let component: AdminoptionsComponent;
  let fixture: ComponentFixture<AdminoptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminoptionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminoptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

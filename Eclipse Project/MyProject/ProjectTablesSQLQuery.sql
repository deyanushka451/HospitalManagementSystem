create table PatientDetails(ID varchar(10) primary key,Name varchar(100),ContactNumber varchar(10),Age varchar(3),Gender varchar(10),BloodGroup varchar(20),Address varchar(100),AnyMajorDisease varchar(500));
create table DiagnosisDetails(PatientID varchar(10) primary key,Symptom varchar(200),Diagnosis varchar(200),Medicines varchar(200),WardRequired varchar(5),TypesOfWard varchar(10));
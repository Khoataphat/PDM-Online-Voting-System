Use OnlineVoting
Create table candidates (Candidate_No int primary key,
Candidate_ID varchar(20) not null,
Candidate_Name Nvarchar(30) not null,
Gender varchar(10) not null,
Age int not null,
Email varchar(30) not null)

Insert into candidates(Candidate_No, Candidate_ID, Candidate_Name, Gender, Age, Email)
values(1, 'ITCSIU22348',	N'Huỳnh Tuấn Khang', 'Male', 20, 'ITCSIU22348@hcmiu.edu.vn'),
(2, 'ITITIU22614',	N'Nguyễn Hoàng Vi Khanh', 'Female', 20, 'ITITIU22614@hcmiu.edu.vn'),
(3, 'ITDSIU21850',	N'Phạm Nguyễn Anh Khôi', 'Male', 21, 'ITDSIU21850@hcmiu.edu.vn'),
(4, 'ITCSIU19040',	N'Lê Thị Khánh Linh', 'Female', 24, 'ITCSIU19040@hcmiu.edu.vn'),
(5, 'ITITIU22836',	N'Nguyễn Hoàng Long', 'Male', 20, 'ITITIU22836@hcmiu.edu.vn')

Select * from candidates
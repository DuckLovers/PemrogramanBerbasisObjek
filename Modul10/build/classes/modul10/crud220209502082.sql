/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Pongo
 * Created: May 16, 2024
 */

CREATE TABLE siswa(
    id varchar(20) NOT NULL,
    nama varchar(100) DEFAULT NULL,
    alamat text,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into siswa(id,nama,alamat) values
('111', 'Anton', 'Blitar'),('222','Ratih','Malang');


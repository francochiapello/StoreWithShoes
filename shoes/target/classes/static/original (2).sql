drop table if exists shoes;

create table videojuego (
    Idshoes int primary key auto_increment,
    name varchar(200) not null,
    descripcion varchar(3000),
    price double,
    sexshoes varchar(20)
);

alter table shoes
add column enablesize_id int,
add foreign key (enablesize_id) references size(id);

alter table shoes
add column photo_id int,
add foreign key (photo_id) references photo(id);

alter table shoes
add column color_id int,
add foreign key (color_id) references color(id);


alter table videojuego
modify distribuidor_id int not null;

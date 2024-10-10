

create table playlists (
id integer primary key autoincrement,
user_id integer,
name text not null,
foreign key (user_id) references users(id)
)
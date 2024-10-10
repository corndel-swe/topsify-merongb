-- We'll also be making a junction table called "track_genres"

-- It will need two columns:
  -- track_id (this is a string)
  -- genre_id (this is an integer)

-- Of course, these need to be foreign keys to the relevant tables

-- Could you write the SQL to set up this junction table?

create table track_genres (
track_id text not null,
genre_id integer not null,
foreign key (track_id) references tracks(id),
foreign key (genre_id) references genres(id)
)

-- checking pr
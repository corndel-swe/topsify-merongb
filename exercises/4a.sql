-- List the name of every album in the database
-- Include the artist name
-- (Make sure to select the album name first, then the artist name)
select albums.name, artists.name from albums
inner join artists on albums.artist_id = artists.id;
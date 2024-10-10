-- Create a list of all artist names
-- Include a count of how many albums they have released
-- Order your results by artist name in ascending order
-- (You should group the artists by id, not by name)
select artists.name, count(albums.name)
from artists
inner join albums on albums.artist_id = artists.id
group by artists.id
order by artists.name asc

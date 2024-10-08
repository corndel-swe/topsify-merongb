-- Create a list of all album names
-- Include the total duration of the album
-- Sort the results by album duration, with the longest first
select albums.name, SUM(tracks.duration_ms)
from albums
inner join tracks on albums.id = tracks.album_id
group by albums.id
order by SUM(tracks.duration_ms) desc
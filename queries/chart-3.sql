.mode json

select
 albums.name as album_name,
avg(features.loudness) as average_loudness,
albums.release_date
from tracks
join features on features.track_id = tracks.id
join albums on tracks.album_id = albums.id
group by album_name
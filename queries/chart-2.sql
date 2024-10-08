.mode json

select
    artists.name as artist_name,
    albums.name as album_name,
    AVG(features.danceability) as average_danceability,
    AVG(features.energy) as average_energy,
    AVG(features.speechiness) as average_speechiness,
    AVG(features.acousticness) as average_acousticness,
    AVG(features.liveness) as average_liveness
from tracks
join features on tracks.id = features.track_id
join albums on tracks.album_id = albums.id
join artists on albums.artist_id = artists.id
group by album_name;

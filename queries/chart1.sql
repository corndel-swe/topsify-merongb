.mode json
select artists.name AS artist_name,
count(tracks.id) as explicit_track_count
from tracks
join albums on tracks.album_id = albums.id
join artists on albums.artist_id = artists.id
where tracks.explicit = 1
group by artists.name
HAVING
    COUNT(tracks.id) > 0
ORDER BY
    explicit_track_count DESC;
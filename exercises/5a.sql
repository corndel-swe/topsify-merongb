-- How many tracks are longer than 5 minutes?
select count(*) from tracks
where duration_ms / 60000 > 5
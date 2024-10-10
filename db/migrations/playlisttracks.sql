

create table playlist_tracks (
    playlist_id INTEGER,
    track_id TEXT,
    PRIMARY KEY (playlist_id, track_id),
foreign key (track_id) references tracks(id),
foreign key (playlist_id) references playlists(id)
)
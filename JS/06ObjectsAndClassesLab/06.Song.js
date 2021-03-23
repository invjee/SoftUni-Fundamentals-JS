function songs(playlist) {
    let numSongs = playlist.shift()
    let typelist = playlist.pop()
   // console.log(typelist)

    class Song {
        constructor(typelist, name, time) {
            this.typelist = typelist
            this.name = name;
            this.time = time
        }

    }

    for (let songOfString of playlist) {
        let [songTypelist, songName, songTime] = songOfString.split('_')        

            let song = new Song(songTypelist, songName, songTime)
           // console.log(song.name)
            if(typelist == 'all'){
                console.log(song.name)
            }else if(typelist == song.typelist){
                console.log(song.name)
            }         
       
    }    

}
songs([3,
    'favourite_DownTown_3:14',
    'favourite_Kiss_4:16',
    'favourite_Smooth Criminal_4:01',
    'favourite']
)
// songs([4,
//     'favourite_DownTown_3:14',
//     'listenLater_Andalouse_3:24',
//     'favourite_In To The Night_3:58',
//     'favourite_Live It Up_3:48',
//     'listenLater']
//     )
// songs([2,
//     'like_Replay_3:15',
//     'ban_Photoshop_3:48',
//     'all']
//     )
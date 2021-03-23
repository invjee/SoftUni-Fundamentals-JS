function gramophon(arg1, arg2, arg3){
    let band = arg1;
    let album = arg2;
    let song = arg3;
    let songDuration = album.length*band.length*song.length/2
    //console.log(songDuration)
    let rotations = Math.ceil(songDuration/2.5)
    console.log(`The plate was rotated ${rotations} times.`)


}
gramophon('Black Sabbath', 'Paranoid', 'War Pigs')
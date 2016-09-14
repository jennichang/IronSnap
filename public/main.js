function getUser(userData) {
    if (userData.length == 0) {
        $("#login").show();
    }
    else {
        $('#check-box-publicPhoto').attr('checked' ) == true
        $("#upload").show();
        $("#logout").show();
    }
}

$.get("/user", getUser);


function getPhotos(photosData) {
    for (var i in photosData) {
        var photo = photosData[i];
        var elem = $("<img>");
        elem.attr("src", photo.filename);
        $("#photos").append(elem);
    }
}

$.get("/user", getUser);
$.get("/photos", getPhotos);
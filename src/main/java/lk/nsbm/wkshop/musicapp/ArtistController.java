package lk.nsbm.wkshop.musicapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class ArtistController {

    @RequestMapping(method = RequestMethod.POST, path = "/artists")
    public Artist create(@RequestBody Artist artist) {
        // do some advanced coding here
        return artist;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/artists/{artistName}")
    public Artist getArtistByName(@PathVariable String artistName) {

        return new Artist("Bon", "Jovi", "Male", "https://upload.wikimedia.org/wikipedia/commons/7/7d/Jonbj2013.jpg");
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/artists/{artistName}")
    public Artist update(@PathVariable String artistName){
        return new Artist();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/artists/{artistName}")
    public void delete(@PathVariable String artistName){
        return;
    }
}

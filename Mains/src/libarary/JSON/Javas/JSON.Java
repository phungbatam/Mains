package libarary.JSON.Javas;

import java.util.ArrayList;

class JSON{
    ArrayList < Object > Info = new ArrayList < Object > ();
    ArrayList < Object > Download = new ArrayList < Object > ();
    private String name;
    private String version;
    private String description;
    private String main;
    Dependencies DependenciesObject;
    DevDependencies DevDependenciesObject;
    Scripts ScriptsObject;
    ArrayList < Object > keywords = new ArrayList < Object > ();
    private String author;
    private String license;
    ArrayList < Object > posts = new ArrayList < Object > ();
    ArrayList < Object > comments = new ArrayList < Object > ();
    Profile ProfileObject;


    // Getter Methods

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public Dependencies getDependencies() {
        return DependenciesObject;
    }

    public DevDependencies getDevDependencies() {
        return DevDependenciesObject;
    }

    public Scripts getScripts() {
        return ScriptsObject;
    }

    public String getAuthor() {
        return author;
    }

    public String getLicense() {
        return license;
    }

    public Profile getProfile() {
        return ProfileObject;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDependencies(Dependencies dependenciesObject) {
        this.DependenciesObject = dependenciesObject;
    }

    public void setDevDependencies(DevDependencies devDependenciesObject) {
        this.DevDependenciesObject = devDependenciesObject;
    }

    public void setScripts(Scripts scriptsObject) {
        this.ScriptsObject = scriptsObject;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setProfile(Profile profileObject) {
        this.ProfileObject = profileObject;
    }
}

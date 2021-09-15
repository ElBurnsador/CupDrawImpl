package model;

public class Team {

    private String teamName;
    private String managerName;

    public Team(String teamName, String managerName) {
        this.teamName = teamName;
        this.managerName = managerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Team {" +
                "teamName='" + teamName + '\'' +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}

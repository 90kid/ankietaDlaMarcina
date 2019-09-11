package sample;

import java.io.FileWriter;
import java.io.IOException;

class SaveTXT {
    private String name;
    SaveTXT(String name){
        this.name = name;
    }

    void SaveFile(){
        try {
            FileWriter txtFile = new FileWriter(this.name + ".txt");
            txtFile.append(getLabelContent(Controller.getQuestion1()))
                    .append("\n")
                    .append(getLabelContent(Controller.getQuestion2()))
                    .append("\n")
                    .append(getLabelContent(Controller.getQuestion3()));
            txtFile.flush();
            txtFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getLabelContent(Question question){
        return question.getContent() + " Happy:" + question.getHappyCounter() + " Mid:" + question.getMidCounter() + " Sad:" + question.getSadCounter();
    }
}
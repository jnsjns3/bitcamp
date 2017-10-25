
public class ScoreDao {

    Score[] scores = new Score[100];
    int cursor = 0;
    
    void add(Score score) {
        if(this.cursor == this.scores.length) {
            
            System.out.println("저장개수 초과");
            return;
        }
        this.scores[this.cursor++] = score;
    }
    
    int size() {
        return this.cursor;
    }
    
    
    Score get(int index) {
        if(index < 0 || index >= this.cursor) {
            return null;
        }
        return this.scores[index];
    }
}

package demo.avoid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ArticleService {

    @Value("${dummy.value}")
    private String value;

    public String getArticleWithDelay(){
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    public String getArticle(){
        return value;
    }
}

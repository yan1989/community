package com.app.community;

import com.app.community.utils.SummaryExtractor;
import org.junit.jupiter.api.Test;

public class DefaultTests {

  @Test
  public void test() {

    String html = """
      Starting CommunityApplication using Java 17.0.8.1 with PID 18280 (D:\\IdeaProject\\community\\target\\classes started by Administrator in D:\\IdeaProject\\community)
      Starting CommunityApplication using Java 17.0.8.1 with PID 18280 (D:\\IdeaProject\\community\\target\\classes started by Administrator in D:\\IdeaProject\\community)
      Starting CommunityApplication using Java 17.0.8.1 with PID 18280 (D:\\IdeaProject\\community\\target\\classes started by Administrator in D:\\IdeaProject\\community)
      Starting CommunityApplication using Java 17.0.8.1 with PID 18280 (D:\\IdeaProject\\community\\target\\classes started by Administrator in D:\\IdeaProject\\community)
      """;
    System.out.println(SummaryExtractor.generate(html, 201));
  }
}

package com.app.community.utils;

import org.jsoup.Jsoup;

public class SummaryExtractor {
  /**
   * 从 HTML 中提取纯文本内容
   *
   * @param html HTML 字符串
   * @return 提取的纯文本内容
   */
  private static String extractTextFromHtml(String html) {
    assert !html.isBlank();
    return Jsoup.parse(html)
      .text();
  }

  /**
   * 从文本中提取摘要（简单实现：提取前几句）
   *
   * @param html          原文内容
   * @param sentenceCount 摘要中包含的句子数量
   * @return 生成的摘要
   */
  public static String generate(String html, int sentenceCount) {
    String text = extractTextFromHtml(html);
    StringBuilder summary = new StringBuilder();
    if (text.length() >= sentenceCount) {
      String subStringText = text.substring(0, sentenceCount);
      summary.append(subStringText);
    } else {
      summary.append(text);
    }
    return summary.deleteCharAt(summary.length() - 1)
      .append("...")
      .toString();
  }
}

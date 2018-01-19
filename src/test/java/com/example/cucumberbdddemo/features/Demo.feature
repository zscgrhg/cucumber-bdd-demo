Feature: do welcome

  Scenario Outline: do welcome
    Given 新加入同事邮箱'<recip>'
    When 系统发送邮件'<title>','<content>'
    Then 新加入同事收到邮件,内容为'<content>'
    Examples:
      | recip                     | title | content             |
      | li.wenkui@zte.com.cn      | nihao | nihao liwenkui      |
      | hu.bin@zte.com.cn         | nihao | nihao hubin         |
      | zhong.miaoding@zte.com.cn | nihao | nihao zhongmiaoding |
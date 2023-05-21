#!/usr/bin/env groovy
def call(String msg){
  sh "curl -s -X POST https://api.telegram.org/bot5871480698:AAHy9EcjCMN4jUCjEUqYCx-f-KoZNVU4Uzg/sendMessage -d chat_id=456400937 -d text='${msg}'" 
}

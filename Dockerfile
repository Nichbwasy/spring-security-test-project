FROM tomcat

RUN chmod +x /run-catalina.sh

CMD ["/run-catalina.sh"]
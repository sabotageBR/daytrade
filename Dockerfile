FROM airhacks/glassfish
COPY ./target/daytrade.war ${DEPLOYMENT_DIR}

pipeline {
    agent any
    environment {
        // 젠킨스에서 만든 ID를 가져와서 변수에 할당
        MY_NAVER_ID = credentials('NAVER_MAIL_ID')
        MY_NAVER_PW = credentials('NAVER_MAIL_PW')
        MY_GOOGLE_ID = credentials('GOOGLE_MAIL_ID')
        MY_GOOGLE_PW = credentials('GOOGLE_MAIL_PW')
        MY_API = credentials('OPENAI_API_KEY')
    }
    stages {
        stage('Checkout') {
            steps {
                // GitHub에서 소스 코드를 가져옵니다.
                checkout scm
            }
        }

        stage('Docker Build') {
            steps {
                script {
                    // 1. Docker 이미지를 빌드합니다.
                    // 'my-shop-app'은 이미지 이름입니다. 원하는 이름으로 변경하세요.
                    sh 'docker build -t my-shop-app .'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // 2. (선택 사항) 기존 컨테이너가 있다면 중지 및 삭제
                    sh 'docker stop shop-container || true'
                    sh 'docker rm shop-container || true'

                    // 3. 빌드한 이미지로 컨테이너 실행
                    sh """
                    docker run -d -p 8888:8888 --name shop-container \
                    --add-host=host.docker.internal:host-gateway \
                    -e NAVER_MAIL_ID="${MY_NAVER_ID}" \
                    -e NAVER_MAIL_PW="${MY_NAVER_PW}" \
                    -e GOOGLE_MAIL_ID="${MY_GOOGLE_ID}" \
                    -e GOOGLE_MAIL_PW="${MY_GOOGLE_PW}" \
                    -e OPENAI_API_KEY="${MY_API}" \
                    -e SPRING_AI_OPENAI_API_KEY="${MY_API}" \
                    my-shop-app
                    """
                }
            }
        }
    }
}
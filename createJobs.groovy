pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('spring-petclinic') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/broadcastninja/spring-petclinic.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}



pipelineJob('pring-petclinic-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/broadcastninja/spring-petclinic.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}

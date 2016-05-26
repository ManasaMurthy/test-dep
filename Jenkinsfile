node {
  stage 'Checkout'
  git url: 'http://10.236.246.220:9090/crodav/test-dep.git'

  stage 'Build'
  sbt('default', 'test')
}

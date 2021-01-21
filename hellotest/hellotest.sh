#!/bin/sh

set -ex
# $IMAGE system env variable

docker pull ccr.ccs.tencentyun.com/shuhe/hellotest:latest && docker tag ccr.ccs.tencentyun.com/shuhe/hellotest:latest $IMAGE && docker push $IMAGE

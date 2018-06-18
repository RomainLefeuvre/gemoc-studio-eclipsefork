#!/bin/bash



showBranchForFolder () {
   local originFolder=`pwd`
   cd $1
   echo $1 is on branch `git rev-parse --abbrev-ref HEAD`
   cd $originFolder
}

cd $1
for D in *; do
    if [ -d "${D}" ]; then
	showBranchForFolder ${D}
    fi
done


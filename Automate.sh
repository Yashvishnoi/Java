
git status
git add .

echo 'Enter commit message'
read commitMessage

git commit -m "$commitMessage"


git push -u origin master

read

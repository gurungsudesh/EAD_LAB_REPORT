# Objective: Source Code Mangaement
---
## Theory:
---

Source code management (SCM) is used to track modifications to a source code repository. SCM tracks a running history of changes to a code base and helps resolve conflicts when merging updates from multiple contributors. SCM is also synonymous with Version control. 

As software projects grow in lines of code and contributor head count, the costs of communication overhead and management complexity also grow. SCM is a critical tool to alleviate the organizational strain of growing development costs.

## Types of version control
---
There are two main types of version control:

### 1. Centralized Version Control
The main concept of Centralized Version Control is that it works in a client and server relationship. The repository is located in one place and allows access to multiple clients.

It’s very similar to FTP where you have FTP clients which connect to FTP server. Here all the user changes and commits have to pass through the central server. For Ex: Subversion.

The benefits of centralized version control are:

* It’s easy to understand.
* There are more GUI and IDE clients.
* You have more control over the users and access.

It's drawbacks includes:

* It is dependent on the access to the server.
* It can be slower because every command from the client has to pass the server.
* Branching and merging strategies are difficult to use.

### 2. Distributed Version Control

These systems are newer to use. In Distributed Version Control, each user has their own copy of the entire repository as well as the files and history. For Ex: Git and Mercurial

The benefits of distributed version control are:

* More powerful and easy change tracking.
* No need of a centralized server. Most of the functionalities work in offline mode also apart from sharing the repositories.
* Branching and Merging strategies are more easy and reliable.
* It’s faster than the other one.

It's drawbacks includes:

* It is harder to understand.
* It’s new, so less GUI clients.
* It is easier to make mistakes until you are familiar with the model.

### Git as a Source Code Management
---
Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.Git is easy to learn and has a tiny footprint with lightning fast performance. It outclasses SCM tools like Subversion, CVS, Perforce, and ClearCase with features like cheap local branching, convenient staging areas, and multiple workflows.

### Workflow of git

![Workflow of git](https://i.redd.it/nm1w0gnf2zh11.png)

1. __Working Directory__ : 
The Working Directory is the area where you are currently working. It is where your files live. This area is also known as the “untracked” area of git. Any changes to files will be marked and seen in the Working Directory. Here if you make changes and do not explicitly save them to git, you will lose the changes made to your files. Run the command git --status. This command will show you two things: The files in your Working Tree and the files in your Staging Area. It will look something like the image below if you don’t have anything in your Staging Area.We use git --init to initialize the working directory.

1. __Staging Area__ : The Staging Area is when git starts tracking and saving changes that occur in files. These saved changes reflect in the .git directory. That is about it when it comes to the Staging Area. You tell git that I want to track these specific files, then git says okay and moves them from you Working Tree to the Staging Area and says “Cool, I know about this file in its entirety.”. Running the command git add #filename# will add a specific file to the Staging Area from your Working Tree. If you want to add everything from the Working Tree, then run the command git add . The . operator is a wildcard meaning all files.

1. __Local Repository__ : The Local Repository is everything in your .git directory. Mainly what you will see in your Local Repository are all of your checkpoints or commits. It is the area that saves everything (so don’t delete it). That’s it.How do you add items from your Staging Area to your Local Repository? The git command git commit takes all changes in the Staging Area, wraps them together and puts them in your Local Repository. A commit is simply a checkpoint telling git to track all changes that have occurred up to this point using our last commit as a comparison. After committing, your Staging Area will be empty.

1. __Remote Repository__ : A remote in Git is a common repository that all team members use to exchange their changes. In most cases, such a remote repository is stored on a code hosting service like GitHub or on an internal server.In contrast to a local repository, a remote typically does not provide a file tree of the project's current state. Instead, it only consists of the .git versioning data.

List of commands that we often see or use:

git init → Create a new git repository.  
git add “newfile” → Add a new file to your staging area.  
git commit → Adds staged changes to your local repository.  
git push “remote” “ branch” → Push local repository changes to your hosting service.  
git pull “remote” “ branch” → pull code from your hosting service to your local directory.  
git branch → See local branches.  
git branch “newName” → Create new local branch.  
git checkout “branchName” → Switch branches.  
git diff → See the actual difference in code between your working tree and your staging area.   
git status → Show which files are being tracked v. untracked.  
git log → Show recent commit history.  
git show “commit_id” → show details of specific commit.  
git stash → stash working directory.  
git help → manpages for git.  
git help “gitCommand”.

### Workflow of git
---
1. Fork the target repo to your own account.
1. Clone the repo to your local machine.
1. Check out a new "topic branch" and make changes.
1. Push your topic branch to your fork.
1. Use the diff viewer on GitHub to create a pull request via a discussion.
1. Make any requested changes.
1. The pull request is then merged (usually into the master branch) and the topic branch is deleted from the upstream (target) repo.

__Step 1: Forking__  
Fork the repo on GitHub.com

__Step 2: Cloning__   
Clone the repo using the URL in the right sidebar:

```bash
git clone git@github.com:jcutrell/jquery.git    
```
__Step 3: Adding the Upstream Remote__ 
Change into the cloned directory and then at this point, you can add the upstream remote:
```bash
cd jquery
git remote add upstream git@github.com:jquery/jquery.git   
```
This will now allow you to pull in changes from the source locally and merge them, like so:
```bash	
git fetch upstream
git merge upstream/master
```

__Step 4: Checking Out a Topic Branch__   
However, before you make your own changes, checkout a topic branch:
```bash
git checkout -b enhancement_345
```

__Step 5: Committing__   
Now, you can make your changes, and create a commit that tracks *just those changes*.
```bash
git commit -am "adding a smileyface to the documentation."
```

__Step 6: Pushing__   
Next, you'll push this topic branch to your own fork of the project.
```bash
git push origin enhancment_345
```

__Step 7: Creating a pull Request__  
Finally, you will create a pull request. First, go to your fork of the repo. You might see a __"your recently pushed branches"__, and if so, you can choose __"Compare and Pull Request"__. Otherwise, you can select your branch from the dropdown, and subsequently click __"Pull Request"__ or __"Compare"__ at the top right of the repo section.


### Branching
---
A branch in Git is simply a lightweight movable pointer to one of these commits. The default branch name in Git is master . As you start making commits, you're given a master branch that points to the last commit you made. Every time you commit, the master branch pointer moves forward automatically.The belows shows the basic branching in git.

### Creating a new branch
```bash
git branch <branch>
```
### Deleting a branch
```bash
git branch -d <branch>
```
### To switch to specified branch and update the working directory
```bash
git checkout <branch>
```
### To merge branch
```bash
git merge <branch>
```
### Conclusion

From the above lab session we can conclude that Real life projects generally have multiple developers working in parallel. So a version control system like Git is needed to ensure there are no code conflicts between the developers.Additionally, the requirements in such projects change often. So a version control system allows developers to revert and go back to an older version of the code.Finally, sometimes several projects which are being run in parallel involve the same codebase. In such a case, the concept of branching in Git is very important.
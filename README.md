# Dashboard4131
SmartDashboard extension for our team's custom widgets

## Widgets
### StatusAlert
Status alerts are for displaying boolean values critical to drivers. Status alerts are designed to be resized, and made large enough that drivers can see them in peripheral vision.

## Setup (Use)
1. Download `dashboard4131.jar` from the root of this repository into `C:\Users\{you}\SmartDashboard\extensions`.
1. Run SmartDashboard as normal.
1. Enter Editable mode by pressing Ctrl-E or selecting View > Editable from the ribbon.
1. Right-click any field and hover over "Change to..."
1. Pick the field type you want to use.

## Contributing
### Development Setup
1. Clone this repository using Git.
1. In Eclipse, create a project in this folder.
1. Right-click the project, hover over Build Path, and click Configure Build Path...
1. Go to the Libraries tab, and click Add External Jars...
1. Select to `C:\Users\{you}\wpilib\tools\SmartDashboard.jar`.
1. Download SmartDashboard's source from the [GitHub repository](https://github.com/wpilibsuite/SmartDashboard). Click "Clone or Download" and "Download as ZIP", then extract it.
1. In Eclipse, expand the option for SmartDashboard.jar and double-click the "Source attachment" option.
1. Click "External Folder..."
1. Select `{path-to-SmartDashboard-source}/src/main/java`.

### Exporting and Testing
1. Right-click the project and click "Export..."
1. Expand Java and select JAR file. Click Next.
1. Deselect .classpath, .gitignore, and .project on the right side.
1. Set the export destination to "C:\Users\{you}\SmartDashboard\extensions\dashboard4131.jar". This will put it in the place for SmartDashboard to use it.
1. Click Finish.
1. For committing, we use a pre-commit hook to copy the jar from its exported location to the repository root so that it is uploaded. To set this up, create a file called `pre-commit` in `.git/hooks` with this content:  
```bash
#!/bin/sh
cp C:/Users/{you}/SmartDashboard/extensions/dashboard4131.jar . #Copy the exported jar into the repository
git add dashboard4131.jar #Add it, so that it's committed with the rest of the files
```
Now for every commit, the jar will be copied and added to the commit.

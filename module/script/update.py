#! /usr/bin/env python

# Moves all the required files from the jquery git repo to the place where they are needed for play to compile them.
# Run it from the root of the module play application.

import os
import shutil

# Constants
jquery_dist_relative_path = "lib/jquery/dist"
public_relative_path = "public"
public_javascript_relative_path = os.path.join(public_relative_path, "javascripts")


def move_javascripts():
    # Move all the javascripts in to the public directory from where they can be served.
    for file in os.listdir(jquery_dist_relative_path):
        if file.endswith(".js") and not file.endswith(".min.map.js"):
            shutil.copyfile(os.path.join(jquery_dist_relative_path, file), os.path.join(public_javascript_relative_path, file))
    return

if __name__ == "__main__":
    move_javascripts()

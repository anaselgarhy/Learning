# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2020.3.3\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2020.3.3\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "D:\The works\CPP Projects\Test CPP"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\The works\CPP Projects\Test CPP\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Test_CPP.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Test_CPP.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Test_CPP.dir/flags.make

CMakeFiles/Test_CPP.dir/main.cpp.obj: CMakeFiles/Test_CPP.dir/flags.make
CMakeFiles/Test_CPP.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\The works\CPP Projects\Test CPP\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Test_CPP.dir/main.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Test_CPP.dir\main.cpp.obj -c "D:\The works\CPP Projects\Test CPP\main.cpp"

CMakeFiles/Test_CPP.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Test_CPP.dir/main.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "D:\The works\CPP Projects\Test CPP\main.cpp" > CMakeFiles\Test_CPP.dir\main.cpp.i

CMakeFiles/Test_CPP.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Test_CPP.dir/main.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "D:\The works\CPP Projects\Test CPP\main.cpp" -o CMakeFiles\Test_CPP.dir\main.cpp.s

# Object files for target Test_CPP
Test_CPP_OBJECTS = \
"CMakeFiles/Test_CPP.dir/main.cpp.obj"

# External object files for target Test_CPP
Test_CPP_EXTERNAL_OBJECTS =

Test_CPP.exe: CMakeFiles/Test_CPP.dir/main.cpp.obj
Test_CPP.exe: CMakeFiles/Test_CPP.dir/build.make
Test_CPP.exe: CMakeFiles/Test_CPP.dir/linklibs.rsp
Test_CPP.exe: CMakeFiles/Test_CPP.dir/objects1.rsp
Test_CPP.exe: CMakeFiles/Test_CPP.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\The works\CPP Projects\Test CPP\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Test_CPP.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Test_CPP.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Test_CPP.dir/build: Test_CPP.exe

.PHONY : CMakeFiles/Test_CPP.dir/build

CMakeFiles/Test_CPP.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Test_CPP.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Test_CPP.dir/clean

CMakeFiles/Test_CPP.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\The works\CPP Projects\Test CPP" "D:\The works\CPP Projects\Test CPP" "D:\The works\CPP Projects\Test CPP\cmake-build-debug" "D:\The works\CPP Projects\Test CPP\cmake-build-debug" "D:\The works\CPP Projects\Test CPP\cmake-build-debug\CMakeFiles\Test_CPP.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Test_CPP.dir/depend

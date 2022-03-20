
def get_branches() {
    def cmd = ['/bin/sh',  '-c',  'git branch -r | sed -E s#.*/##']
    def toreturn
    cmd.execute().with {
        def output = new StringWriter()
        def error = new StringWriter()
        it.waitForProcessOutput(output, error)
        toreturn = output
    }
    return toreturn
}

branches = get_branches()
for (mystring in output) {
    print(mystring)
}
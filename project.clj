(defproject aoc-2022 "0.1.0"
  :description "Advent of Code 2022"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [babashka "1.0.168"]
                 [org.clojure/core.match "1.0.0"]
                 [nrepl "1.0.0"]]
  :plugins  [[cider/cider-nrepl "0.26.0"]
             [refactor-nrepl "3.6.0"]
             [mx.cider/enrich-classpath "1.9.0"]]
  :resource-paths ["resources"]
  :repl-options {:init-ns aoc-2022.day3})

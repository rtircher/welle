(defproject com.novemberain/welle "0.1.0-SNAPSHOT"
  :description "An experimental wrapper around Riak Java client"
  :dependencies [[org.clojure/clojure        "1.3.0"]
                 [com.basho.riak/riak-client "1.0.1"]]
  :repositories { "sonatype"
                 {:url "http://oss.sonatype.org/content/repositories/releases"
                  :snapshots false
                  :releases {:checksum :fail :update :always}
                  }}
  :warn-on-reflection true)
# 🧠 CONTEXT — Master Memory (read this first)

> **If you are a fresh chat / new session: read this entire file, then [RULES.md](RULES.md), then the latest file in [03-daily/](03-daily/). That is enough to resume teaching exactly where we left off.** This file is the single source of truth. It is updated at the end of every session.

---

## Who I am (the learner)
- **Background:** Knows **JavaScript / Node.js**. Comfortable coding in JS. → *Always teach Java by comparing to JS.*
- **Java level:** Does **NOT know Java at all** — Phase 0 teaches the language from scratch (variables, types, conditionals, loops, references, methods, classes/objects) with NO DSA. Only after that do we touch complexity & patterns.
- **DSA level:** Complete beginner. Started from zero on 2026-06-02.
- **Goal:** Complete DSA mastery → **FAANG/MAANG-ready** in Java.
- **Time budget:** **2 hours/day**, aiming for 6 days/week + 1 weekly review day.
- **Wants:** Deep understanding (not memorization), a permanent Obsidian **notebook**, honest accountability.

## The goal, concretely
Solve a medium LeetCode-style problem in Java in ~25–30 min, explain brute-force → optimal out loud, state time/space complexity, handle edge cases — **and retain it long-term.**

## How we work (the daily flow — 2 hrs)
1. **RECALL (15m)** — Mentor quizzes me on due/yesterday topics *before* anything new. (Testing-first = retention.)
2. **LEARN (30m)** — New concept: what / why it exists / intuition / when NOT to use / tradeoffs. With **JS comparisons**.
3. **PRACTICE (20m)** — Guided walk-through of one example: brute force → optimal.
4. **SOLVE (40m)** — I solve ONE problem independently. Hints only, never the answer up front.
5. **NOTES (10m)** — I say **"generate notes"** → Mentor writes the Obsidian notebook entry in `01-concepts/` (+ problem note in `02-problems/`).
6. **LOG (5m)** — Mentor updates this file + `05-progress/` + `03-daily/`, then commits to Git.

Full detail: [RULES.md](RULES.md). Weekly flow: see "Weekly" in RULES.

## 📍 WHERE I AM RIGHT NOW  ← (the part that changes every day)
- **Phase:** 0 — Java language from zero (NO DSA yet)
- **Current roadmap item:** `0.1 Run Java` (about to start — Day 1 not yet done in v2)
- **Last session:** none yet in v2 (system just rebuilt 2026-06-02)
- **Next action:** Mentor runs first-session **assessment**, then teaches `0.1`.
- **Streak:** 0 days (Day 1 pending)
- **Weak topics to reinforce:** none yet
- **Notes generated so far:** none yet

> Mentor: update the block above at the end of every session. It is how the next chat knows what to do.

## Folder responsibilities (why each exists)
| Folder | Why it exists |
|--------|---------------|
| `CONTEXT.md` (this) | Master memory. Resume point for any new chat. |
| `RULES.md` | How the Mentor must teach. The fine-tuned master prompt. |
| `ROADMAP.md` | The full zero→FAANG curriculum, mastery-gated. |
| `01-concepts/` | Permanent notebook — one deep note per topic. My forever-textbook. |
| `02-problems/` | One note per solved problem: problem + my solution + next-problem pointer. |
| `03-daily/` | One log per day. The source for tomorrow's recall. |
| `04-weekly/` | Weekly interleaved review + re-plan. |
| `05-progress/` | ONE dashboard: streak + mastery + stats. |
| `06-templates/` | The note shapes the Mentor fills in. |
| `src/` | My runnable Java code, mirrors `02-problems/`. |

## ⚠️ Git commit rules (IMPORTANT — applies on every machine)
Commits in this repo must be authored as **`Thowfik Juhair <thowfik.softdev@gmail.com>`** — this is the GitHub account email (`thowfik-softdev`) so commits link to the user's avatar/profile, NOT to "claude".
**Never** add a `Co-Authored-By` trailer, and **never** put the word "claude" or any AI attribution anywhere in a commit (author, committer, message, or contributor). The repo's identity is set in local git config, but if committing manually use:
```bash
git -c user.name="Thowfik Juhair" -c user.email="thowfik.softdev@gmail.com" commit -m "<message>"
```
This rule lives here in CONTEXT so it travels with the repo when cloned to another machine — any assistant must follow it.

## Decisions we've made (so we don't relitigate)
- 2026-06-02: Rebuilt as **single-Mentor** system (no separate agents). Wiped v1 clean.
- 2026-06-02: **Recall-first** daily order chosen (testing before learning).
- 2026-06-02: Notes are **mandatory but on-demand** ("generate notes").
- 2026-06-02: Teach **Java via JavaScript comparisons** (learner knows Node).
- 2026-06-03: Commits authored as **Thowfik Juhair <thowfik.softdev@gmail.com>** (GitHub account email) — no co-author, never the word "claude" anywhere. Rebuilt `.git` fresh to purge old attribution. (See Git commit rules above.)

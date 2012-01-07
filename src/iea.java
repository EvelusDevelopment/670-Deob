import jaggl.OpenGL;

final class iea {

   static int g;
   static int a;
   static int b;
   static int d;
   static int c;
   static int f;
   static int e;


   static final void a(Object[] var0, float var1, int var2, float var3, Object[] var4) {
      ++d;
      if(var2 != 1) {
         ((int[])((int[])var0[0]))[16] = -36;
      }

      int var5 = va.a(var0, (byte)91);
      int var6 = nba.a(var0, (byte)-91);
      if(eva.b(-101, var0) != us.a) {
         throw new bba(var0, "");
      } else {
         if(var5 >= 0) {
            var5 *= 4;
            ((float[])((float[])var4[5]))[var5 - 0] = var1;
            ((float[])((float[])var4[5]))[1 + var5] = var3;
            ((boolean[])((boolean[])var4[8]))[1] = true;
         }

         if(0 <= var6) {
            var6 *= 4;
            ((float[])((float[])var4[7]))[0 + var6] = var1;
            ((float[])((float[])var4[7]))[var6 + 1] = var3;
            ((boolean[])((boolean[])var4[8]))[2] = true;
         }

      }
   }

   static final re b(int var0, Object[] var1) {
      ++b;
      return null != var1 && 6 == var1.length?(re)var1[4]:(null != var1 && -5 == ~var1.length?(re)var1[0]:(var0 != 6?(re)var1[1]:null));
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 4857) {
         a(-70, (Object[])null, 61);
      }

      ++c;
      if(((boolean[])((boolean[])var1[5]))[0]) {
         nha.a((Object[])((Object[])var1[0]), 18806, 1);
         moa.a((byte)98, (Object[])null, (Object[])((Object[])var1[0]));
         nha.a((Object[])((Object[])var1[0]), 18806, 0);
         moa.a((byte)115, (Object[])null, (Object[])((Object[])var1[0]));
         OpenGL.glUseProgram(0);
         ((boolean[])((boolean[])var1[5]))[0] = false;
      }

   }

   static final int a(int var0, Object[] var1, int var2) {
      ++f;
      int var3 = lu.a(rpa.a((Object[])((Object[])var1[var2]), (byte)90), (byte)-3);
      return 96 <= var3?(var0 > 1 && var3 < 128?3:(3 < var0 && var3 < 192?3:1)):3;
   }

   static final void a(int var0, byte var1) {
      if(var1 >= -17) {
         a(-119, (Object[])null);
      }

      ++g;
      if(var0 != ipa.d) {
         String var2;
         String var3;
         Object[] var9;
         if(var0 == 14 || 3 == var0) {
            if(cl.c == null) {
               if(ce.a == -1) {
                  var2 = tba.c;
                  var3 = bm.f;
                  kv.e = lba.f;
                  ww.r = 264;
                  ta.a(var2, var3, false, 62, false);
               } else {
                  ida.a(264);
               }
            } else {
               kv.e = lba.f;
               ww.r = 264;
               var2 = null;
               if(cl.c != null) {
                  var9 = jta.a((byte)-116, cl.c, new Object[3]);
                  var2 = rna.a(Class_i.a(false, var9), 30);
                  fw.b = Class_i.a(false, var9);
               }

               if(null != var2) {
                  ta.a(var2, "", false, 110, true);
               } else {
                  ul.a(35, (byte)-96);
               }
            }
         }

         if(14 != var0 && lka.d != null) {
            qi.a(lka.d, (int)4);
            lka.d = null;
         }

         if(var0 == 9) {
            vma.a(~bqa.j != ~((int[])((int[])fk.j[1]))[1], 74);
         }

         boolean var8;
         if(5 == var0) {
            var8 = ~bqa.j != ~((int[])((int[])fk.j[1]))[3];
            if(var8) {
               if(bqa.j != -1) {
                  cv.a(bqa.j, (byte)89);
               }

               oh var4;
               oh var10;
               for(Object[] var7 = (var10 = (oh)qt.a(0, lfa.c)) == null?null:var10.p; null != var7; var7 = null == (var4 = (oh)nda.a(1, lfa.c))?null:var4.p) {
                  if(!((lm)(var7 == null?null:var7[0])).a(false)) {
                     oh var6;
                     var7 = null == (var6 = (oh)qt.a(0, lfa.c))?null:var6.p;
                     if(null == var7) {
                        break;
                     }
                  }

                  lba.a(false, 4, var7, true);
               }

               bqa.j = -1;
               lfa.c = nb.a((byte)78, 8, new Object[5]);
               kka.a((byte)124);
               bqa.j = ((int[])((int[])fk.j[1]))[3];
               kt.a(false, nma.a, (byte)-82, bqa.j, wr.n);
               mg.b(true);
               wl.a(bqa.j, (byte)-46, (int[])null);
            }

            ff.c = true;
         }

         if(var0 != 6 && var0 != 1) {
            if(12 == var0 || var0 == 15 && ipa.d != 7) {
               if(cl.c != null) {
                  ww.r = 264;
                  kv.e = lba.f;
                  var2 = null;
                  if(null != cl.c) {
                     var9 = jta.a((byte)-83, cl.c, new Object[3]);
                     var2 = rna.a(Class_i.a(false, var9), 30);
                     fw.b = Class_i.a(false, var9);
                  }

                  if(var2 == null) {
                     ul.a(35, (byte)127);
                  } else {
                     ta.a(var2, "", false, 80, true);
                  }
               } else if(ce.a == -1) {
                  var2 = tba.c;
                  var3 = bm.f;
                  ww.r = 264;
                  kv.e = lba.f;
                  ta.a(var2, var3, false, 79, false);
               } else {
                  ida.a(264);
               }
            }
         } else {
            qoa.a(-18962);
         }

         if(pp.a((byte)-63, ipa.d)) {
            ((int[])((int[])ha.f_i[1]))[0] = 2;
            ((int[])((int[])qb.b[1]))[0] = 2;
            ((int[])((int[])dn.a[1]))[0] = 2;
            ((int[])((int[])hn.b[1]))[0] = 2;
            ((int[])((int[])cba.a[1]))[0] = 2;
            ((int[])((int[])pja.f[1]))[0] = 2;
            ((int[])((int[])wn.c[1]))[0] = 2;
         }

         if(pp.a((byte)-63, var0)) {
            jl.c = 0;
            tr.f = 0;
            jg.d = 1;
            hha.a = 1;
            dha.a = 0;
            te.a(true, (byte)-25);
            ((int[])((int[])ha.f_i[1]))[0] = 1;
            ((int[])((int[])qb.b[1]))[0] = 1;
            ((int[])((int[])dn.a[1]))[0] = 1;
            ((int[])((int[])hn.b[1]))[0] = 1;
            ((int[])((int[])cba.a[1]))[0] = 1;
            ((int[])((int[])pja.f[1]))[0] = 1;
            ((int[])((int[])wn.c[1]))[0] = 1;
         }

         if(var0 == 13 || 9 == var0) {
            us.a(12);
         }

         var8 = 4 == var0 || sd.a((int)12, var0) || jpa.a(var0, -117);
         boolean var11 = ipa.d == 4 || sd.a((int)12, ipa.d) || jpa.a(ipa.d, -112);
         if(var11 != var8) {
            if(var8) {
               si.b = nu.b;
               if(hba.a((Object[])((Object[])tu.d[32]), 0) != 0) {
                  hla.a(hba.a((Object[])((Object[])tu.d[32]), 0), false, 0, 2, vra.d, (byte)-46, nu.b);
                  ac.a((byte)-103);
               } else {
                  mn.a((byte)114, 2);
               }

               ssa.a(false, dka.g, (byte)89);
            } else {
               mn.a((byte)102, 2);
               ssa.a(true, dka.g, (byte)118);
            }
         }

         if(pp.a((byte)-63, var0) || 14 == var0 || 3 == var0) {
            lna.g.B();
         }

         ipa.d = var0;
      }
   }

   static final void a(byte var0) {
      ++e;
      int var1 = 0;
      if(1 == oua.a((byte)-26, (Object[])((Object[])tu.d[6]))) {
         var1 |= 1;
         var1 |= 16;
         var1 |= 32;
         var1 |= 2;
         var1 |= 4;
      }

      if(fpa.a((int)0, (Object[])((Object[])tu.d[24])) == 0) {
         var1 |= 64;
      }

      Class_ds.a(var1, (byte)90);
      fba.a(var1, 24112, lja.d);
      qda.a(cqa.a, true, var1);
      wta.a(nt.f_i, var0 - 38, var1);
      qqa.a(-18985, dfa.a, var1);
      jj.u = var1;
      dq.a(69, qma.c);
      rra.f = var1;
      Object[] var2 = vi.e;
      synchronized(vi.e) {
         dq.a(77, vi.e);
      }

      sr.b = var1;
      var2 = kg.a;
      synchronized(kg.a) {
         dq.a(var0 + 22, kg.a);
      }

      var2 = id.f;
      synchronized(id.f) {
         dq.a(-85, id.f);
      }

      if(var0 != 39) {
         a(79, 4, (byte)94, (Object[])null);
      }

      jma.a(var1, (byte)115);
      fra.c((byte)-32);
   }

   static final void a(int var0, int var1, byte var2, Object[] var3) {
      ++a;
      if(var2 != 85) {
         a(-125, (Object[])null);
      }

   }

}

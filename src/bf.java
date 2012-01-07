import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

final class bf {

   static int g;
   static int c;
   static int h;
   static int e;
   static int d;
   static Object[] j = sd.a(new Object[1], 42, (byte)111);
   static int f_i;
   static int f;
   static aa[] f_l;
   static int b;
   static int[] a = new int[4];
   static boolean k = false;


   static final boolean b(int var0, Object[] var1) {
      if(var0 != 17) {
         return ((boolean[])((boolean[])var1[10]))[11];
      } else {
         ++c;
         return false;
      }
   }

   static final void a(boolean var0, byte var1) {
      if(var1 != 109) {
         a = (int[])null;
      }

      ++e;

      tda var2;
      tda var3;
      Object[] var11;
      for(var11 = (var2 = (tda)dda.a(fla.a, var1 ^ 111)) != null?var2.f_l:null; var11 != null; var11 = null != (var3 = (tda)client.a(fla.a, -28280))?var3.f_l:null) {
         if(var11[6] != null) {
            ah.d.b((kp)var11[6]);
            var11[6] = null;
         }

         if(null != var11[0]) {
            ah.d.b((kp)var11[0]);
            var11[0] = null;
         }

         ((lm)(null != var11?var11[11]:null)).a((byte)74);
      }

      if(var0) {
         tda var5;
         tda var6;
         for(var11 = (var5 = (tda)dda.a(nga.g, 2)) != null?var5.f_l:null; var11 != null; var11 = (var6 = (tda)client.a(nga.g, var1 ^ -28187)) == null?null:var6.f_l) {
            if(null != var11[6]) {
               ah.d.b((kp)var11[6]);
               var11[6] = null;
            }

            ((lm)(var11 == null?null:var11[11])).a((byte)96);
         }

         tda var8;
         tda var9;
         for(var11 = null != (var8 = (tda)qt.a(0, qn.g))?var8.f_l:null; null != var11; var11 = (var9 = (tda)nda.a(1, qn.g)) != null?var9.f_l:null) {
            if(var11[6] != null) {
               ah.d.b((kp)var11[6]);
               var11[6] = null;
            }

            ((lm)(var11 != null?var11[11]:null)).a((byte)25);
         }
      }

   }

   static final void a(Object[] var0, int var1, byte var2) {
      int var3 = -73 % ((var2 - 3) / 54);
      ++h;
      if(var0 == null) {
         throw new IllegalStateException();
      } else {
         cva.a(var1, var0, (byte)114);
      }
   }

   static final int a(int var0, int var1, int var2) {
      ++g;
      int var3 = var0 + 57 * var1;
      if(var2 != 11521) {
         k = false;
      }

      var3 ^= var3 << 13;
      int var4 = Integer.MAX_VALUE & 1376312589 + var3 * (var3 * var3 * 15731 - -789221);
      return (134062808 & var4) >> 19;
   }

   static final Object[] a(int var0, Object[] var1) {
      ada.b(var1, 97);
      ++d;
      if(var0 != 20573) {
         a(((int[])((int[])((Object[])((Object[])var1[1]))[0]))[6], (Object[])null);
      }

      uca.a(1, var1, false, false);
      ((int[])((int[])var1[1]))[3] = 4096;
      ((int[])((int[])var1[1]))[2] = 4096;
      ((int[])((int[])var1[1]))[4] = 4096;
      return var1;
   }

   static final void a(byte var0) {
      if(bn.f < 102) {
         bn.f += 6;
      }

      ++f;
      int var1;
      if(~toa.g != 0 && ~he.a(83) < ~os.e) {
         for(var1 = toa.g; ~var1 > ~ki.f.length; ++var1) {
            if(ki.f[var1].startsWith("pause")) {
               int var2 = 5;

               try {
                  var2 = Integer.parseInt(ki.f[var1].substring(6));
               } catch (Exception var10) {
                  ;
               }

               qs.a((byte)123, "Pausing for " + var2 + " seconds...");
               toa.g = 1 + var1;
               os.e = he.a(-85) + (long)(1000 * var2);
               return;
            }

            rt.f = ki.f[var1];
            nja.a((byte)-80, false);
         }

         toa.g = -1;
      }

      if(0 != cea.f) {
         jr.b -= 5 * cea.f;
         if(jr.b >= gka.d) {
            jr.b = -1 + gka.d;
         }

         if(jr.b < 0) {
            jr.b = 0;
         }

         cea.f = 0;
      }

      for(var1 = 0; var1 < qpa.e; ++var1) {
         Object[] var12 = hqa.b[var1];
         int var3 = noa.a(true, var12);
         char var4 = Class_t.a(var12, (int)0);
         int var5 = fv.a(var12, (byte)1);
         if(84 == var3) {
            nja.a((byte)-76, false);
         }

         if(var3 != 80) {
            if(var3 == 66 && (4 & var5) != 0) {
               if(null != jg.c) {
                  String var13 = "";

                  for(int var14 = -1 + ov.b.length; var14 >= 0; --var14) {
                     if(null != ov.b[var14] && -1 > ~ov.b[var14].length()) {
                        var13 = var13 + ov.b[var14] + '\n';
                     }
                  }

                  jg.c.setContents(new StringSelection(var13), (ClipboardOwner)null);
                  if(var12 != null && (var12.length == 8 || 2 == var12.length && var12[0].equals(Integer.valueOf(0)) && var12[0].equals(Integer.valueOf(2)))) {
                     nk.a((String[])null, 6);
                  }
               }
            } else if(67 == var3 && -1 != ~(var5 & 4)) {
               if(null != jg.c) {
                  try {
                     Transferable var6 = jg.c.getContents((Object)null);
                     if(var6 != null) {
                        String var7 = (String)var6.getTransferData(DataFlavor.stringFlavor);
                        if(null != var7) {
                           String[] var8 = ul.a(0, var7, '\n');
                           nk.a(var8, 6);
                        }
                     }
                  } catch (Exception var11) {
                     ;
                  }
               }
            } else if(var3 == 85 && nr.e > 0) {
               rt.f = rt.f.substring(0, nr.e - 1) + rt.f.substring(nr.e);
               --nr.e;
            } else if(var3 == 101 && nr.e < rt.f.length()) {
               rt.f = rt.f.substring(0, nr.e) + rt.f.substring(nr.e + 1);
            } else if(96 == var3 && 0 < nr.e) {
               --nr.e;
            } else if(97 == var3 && nr.e < rt.f.length()) {
               ++nr.e;
            } else if(var3 != 102) {
               if(var3 != 103) {
                  if(104 == var3 && ov.b.length > tt.d) {
                     ++tt.d;
                     tfa.a(-17);
                     nr.e = rt.f.length();
                  } else if(105 == var3 && 0 < tt.d) {
                     --tt.d;
                     tfa.a(-103);
                     nr.e = rt.f.length();
                  } else if(aga.a(var4, 115) || -1 != "\\/.:, _-+[]~@".indexOf(var4)) {
                     rt.f = rt.f.substring(0, nr.e) + Class_t.a(hqa.b[var1], (int)0) + rt.f.substring(nr.e);
                     ++nr.e;
                  }
               } else {
                  nr.e = rt.f.length();
               }
            } else {
               nr.e = 0;
            }
         } else {
            nja.a((byte)112, true);
         }
      }

      qpa.e = 0;
      iua.a = 0;
      mg.b(true);
      var1 = -62 / ((var0 + 66) / 50);
   }

   static final void a(ta var0, Object[] var1, int var2) {
      ++f_i;
      ya var3 = null;
      Object[] var4;
      if(null == var1[15] && ((boolean[])((boolean[])var1[8]))[5]) {
         var4 = gha.a(262144, true, var0, var2 ^ 24530, var1);
         var3 = (ya)(var4 == null?null:var4[0]);
      } else {
         var3 = (ya)var1[15];
         var1[15] = null;
      }

      if(var2 != 24531) {
         a((Object[])null, ((int[])((int[])j[4]))[0], ((byte[])((byte[])var1[13]))[7]);
      }

      var4 = (Object[])((Object[])woa.a(5, var1)[1]);
      if(var3 != null) {
         wg.a(var3, ((byte[])((byte[])var1[10]))[1], (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1], (boolean[])null);
      }

   }

}

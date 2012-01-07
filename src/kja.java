import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.fna;
import jaggl.OpenGL;
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class kja {

   static int e;
   static int c;
   static int k;
   static int j;
   static int b;
   static int f;
   static int h;
   static int g;
   static Object[] d = un.a((byte)59, new Object[0]);
   static int a;
   static int f_i;


   static final int a(int var0, int var1, Object[] var2) {
      ++h;
      if(var1 >= -108) {
         d = (Object[])null;
      }

      if(sda.a(var0, var2, 112)) {
         if(null == ((Object[])((Object[])var2[5]))[var0]) {
            Object[] var4 = (Object[])((Object[])var2[2]);
            if(null == var4) {
               throw new IllegalStateException();
            } else {
               int var3 = fq.a(var0, var4, false);
               return var3;
            }
         } else {
            return 100;
         }
      } else {
         return 0;
      }
   }

   static final Object[] a(float var0, float var1, float var2, Object[] var3, int var4, float var5) {
      if(null == var3[0]) {
         var3[0] = new float[4];
      }

      ++a;
      if(var4 != 12) {
         a(-0.17980438F, ((float[])((float[])d[0]))[8], ((float[])((float[])d[0]))[1], (Object[])null, -19, 1.2659045F);
      }

      sua var7 = new sua(var3);
      var3[1] = var7;
      aha.a(var0, var1, var2, var5, var3, (byte)-74);
      return var3;
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      ((boolean[])((boolean[])var1[3]))[1] = false;
      if(!var2) {
         ((int[])((int[])var1[4]))[0] = -46;
      }

      ((int[])((int[])var1[1]))[0] = var0;
      ++j;
   }

   static final int[] a(int var0, int var1, int var2, Object[] var3, int var4, int var5) {
      ++g;
      int[] var6 = null;
      long var7 = IDirect3DDevice.GetRenderTarget(((long[])((long[])var3[50]))[5], 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(((long[])((long[])var3[50]))[5], var4, var1, 21, 0, 0, true);
      if(fna.a(IDirect3DDevice.StretchRect(((long[])((long[])var3[50]))[5], var7, var2, var5, var4, var1, var9, var0, 0, var4, var1, 1), (byte)116)) {
         IDirect3DSurface.Download(var9, 0, 0, var4, var1, 4 * var4, 16, ((long[])((long[])var3[50]))[0]);
         var6 = new int[var1 * var4];
         ((Buffer)var3[57]).clear();
         ((ByteBuffer)var3[57]).asIntBuffer().get(var6);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
      return var6;
   }

   static final void a(Object[] var0, int var1) {
      if(((int[])((int[])var0[1]))[12] != 2) {
         OpenGL.glDepthRange(0.0F, 1.0F);
      } else {
         OpenGL.glDepthRange(((float[])((float[])var0[25]))[11], ((float[])((float[])var0[25]))[6]);
      }

      if(var1 < 114) {
         a((Object[])null, -91, new Object[3], ((byte[])((byte[])var0[0]))[10]);
      }

      ++k;
   }

   static final int c(int var0, Object[] var1) {
      if(var0 != 0) {
         return 106;
      } else {
         ++f_i;
         return caa.c[((int[])((int[])var1[1]))[0]];
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, byte var3) {
      ++b;
      if(null != var0 && var0.length == 17 && ((int[])((int[])var0[1])).length == 4) {
         gaa.a(var2, var1, var0, 1);
      } else if(var0 != null && var0.length == 6 && ((int[])((int[])var0[1])).length == 8) {
         la.a(var1, var2, false, var0);
      } else if(var0 != null && var0.length == 11 && ((int[])((int[])var0[1])).length == 7) {
         cna.a(var1, (byte)32, var2, var0);
      } else if(null != var0 && 7 == var0.length) {
         if(3 != var1) {
            if(var1 != 0) {
               if(var1 != 4) {
                  if(var1 != 2) {
                     if(var1 == 1) {
                        ((int[])((int[])var0[1]))[3] = de.a((int)0, var2);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[5] = fh.a(var2, false);
                  }
               } else {
                  ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
               }
            } else {
               ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
            }
         } else {
            ((int[])((int[])var0[1]))[4] = de.a((int)0, var2);
         }

      } else if(null != var0 && var0.length == 21) {
         ura.a(var2, var1, var0, var3 ^ -5);
      } else {
         int var4;
         if(null != var0 && var0.length == 13) {
            if(var1 == 0) {
               var4 = fh.a(var2, false);
               if(0 != var4) {
                  oe.a(var4, var0, 99);
               } else {
                  var0[6] = new int[fh.a(var2, false)][4];

                  for(int var5 = 0; ((Object[])((Object[])var0[6])).length > var5; ++var5) {
                     ((int[][])((int[][])var0[6]))[var5][0] = de.a(var3 ^ -11, var2);
                     ((int[][])((int[][])var0[6]))[var5][1] = fh.a(var2, false) << 4;
                     ((int[][])((int[][])var0[6]))[var5][2] = fh.a(var2, false) << 4;
                     ((int[][])((int[][])var0[6]))[var5][3] = fh.a(var2, false) << 4;
                  }
               }
            }

         } else if(null != var0 && var0.length == 6 && -4 == ~((int[])((int[])var0[1])).length) {
            if(0 != var1) {
               if(1 == var1) {
                  ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
               } else if(var1 == 2) {
                  ((boolean[])((boolean[])var0[3]))[0] = fh.a(var2, false) == 1;
               }
            } else {
               ((int[])((int[])var0[1]))[2] = fh.a(var2, false);
            }

         } else if(null != var0 && 11 == var0.length && ((int[])((int[])var0[1])).length == 5 && ((int[])((int[])var0[1]))[1] == 1) {
            av.a(var2, var1, var0, 1);
         } else if(null != var0 && -24 == ~var0.length) {
            sn.a(var0, var2, (byte)-125, var1);
         } else if(var0 != null && 17 == var0.length && ((int[])((int[])var0[1])).length == 2) {
            if(0 == var1) {
               ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
            }

         } else if(var0 != null && var0.length == 14) {
            if(0 == var1) {
               ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
               var0[7] = new int[fh.a(var2, false)][2];
               if(null != var2 && var2.length == 8) {
                  return;
               }

               for(var4 = 0; ((Object[])((Object[])var0[7])).length > var4; ++var4) {
                  ((int[][])((int[][])var0[7]))[var4][0] = de.a(var3 + 11, var2);
                  ((int[][])((int[][])var0[7]))[var4][1] = de.a((int)0, var2);
               }
            }

         } else if(null != var0 && -26 == ~var0.length && 11 == ((int[])((int[])var0[1])).length) {
            tna.a(var2, var0, var1, true);
         } else if(var0 != null && var0.length == 25 && ((int[])((int[])var0[1])).length == 5) {
            if(var1 == 0) {
               ((int[])((int[])var0[1]))[4] = de.a((int)0, var2);
            } else if(3 != var1) {
               if(var1 != 2) {
                  if(var1 == 1) {
                     ((int[])((int[])var0[1]))[3] = de.a((int)0, var2);
                  }
               } else {
                  ((int[])((int[])var0[1]))[2] = de.a(var3 ^ -11, var2);
               }
            } else {
               ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
            }

         } else if(var0 != null && -25 == ~var0.length) {
            if(0 == var1) {
               ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
            } else if(1 != var1) {
               if(3 == var1) {
                  ((int[])((int[])var0[1]))[3] = fh.a(var2, false);
               }
            } else {
               ((int[])((int[])var0[1]))[2] = fh.a(var2, false);
            }

         } else if(null != var0 && (8 == var0.length || var0.length == 11 && ((int[])((int[])var0[1])).length == 4)) {
            if(0 == var1) {
               ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
            }

         } else if(var0 != null && var0.length == 15) {
            if(var1 == 0) {
               ((int[])((int[])var0[1]))[3] = de.a((int)0, var2);
            }

         } else if(var0 != null && -23 == ~var0.length) {
            gh.a((byte)34, var2, var0, var1);
         } else if(var0 != null && -12 == ~var0.length && -4 == ~((int[])((int[])var0[1])).length) {
            Class_p.a(var2, var1, var0, var3 - 92);
         } else if(var0 != null && 12 == var0.length && 1 == ((int[])((int[])var0[1])).length) {
            if(0 == var1) {
               ((boolean[])((boolean[])var0[3]))[0] = fh.a(var2, false) == 1;
            }

         } else if(var0 != null && var0.length == 10) {
            if(1 != var1) {
               if(var1 != 0) {
                  if(var1 != 2) {
                     if(4 == var1) {
                        ((int[])((int[])var0[1]))[4] = de.a((int)0, var2);
                     } else if(5 != var1) {
                        if(3 == var1) {
                           ((int[])((int[])var0[1]))[3] = de.a((int)0, var2);
                        } else if(var1 == 6) {
                           ((int[])((int[])var0[1]))[11] = de.a((int)0, var2);
                        } else if(7 == var1) {
                           ((int[])((int[])var0[1]))[9] = de.a(var3 + 11, var2);
                        }
                     } else {
                        ((int[])((int[])var0[1]))[1] = de.a(var3 ^ -11, var2);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[5] = de.a(var3 ^ -11, var2);
                  }
               } else {
                  ((int[])((int[])var0[1]))[7] = fh.a(var2, false);
               }
            } else {
               ((int[])((int[])var0[1]))[8] = fh.a(var2, false);
            }

         } else if(var0 != null && -26 == ~var0.length && ((int[])((int[])var0[1])).length == 4) {
            if(0 == var1) {
               ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
            } else if(var1 != 1) {
               if(2 == var1) {
                  ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
               }
            } else {
               ((int[])((int[])var0[1]))[3] = fh.a(var2, false);
            }

         } else {
            if(var0 != null && (-2 == ~var0.length && var0[0].equals(Integer.valueOf(2)) || 32 == var0.length && var0[15].equals(Integer.valueOf(0)))) {
               ms.a(68, (int)-17);
            }

            if(null != var0 && 9 == var0.length) {
               ng.a(var1, 87, var2, var0);
            } else if(null != var0 && 12 == var0.length && ((int[])((int[])var0[1])).length == 2) {
               if(var1 == 0) {
                  ((boolean[])((boolean[])var0[3]))[0] = -2 == ~fh.a(var2, false);
               }

            } else if(var0 != null && 12 == var0.length && ((int[])((int[])var0[1])).length == 3) {
               aja.a(false, var2, var1, var0);
            } else {
               if(var3 != -11) {
                  a(117, ((int[])((int[])var2[3]))[2], 94, (Object[])((Object[])d[16]), 113, ((int[])((int[])d[11]))[2]);
               }

               if(var0 != null && var0.length == 11 && -6 == ~((int[])((int[])var0[1])).length && -1 == ~((int[])((int[])var0[1]))[1]) {
                  if(2 != var1) {
                     if(1 == var1) {
                        ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
                     } else if(var1 == 0) {
                        ((int[])((int[])var0[1]))[4] = fh.a(var2, false);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[3] = fh.a(var2, false);
                  }

               } else if(null != var0 && var0.length == 20) {
                  if(var1 == 0) {
                     ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
                  }

               } else if(null != var0 && var0.length == 16) {
                  if(var1 == 2) {
                     ((int[])((int[])var0[1]))[1] = de.a((int)0, var2);
                  } else if(var1 == 0) {
                     ((int[])((int[])var0[1]))[3] = de.a((int)0, var2);
                  } else if(1 == var1) {
                     ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
                  }

               } else if(null != var0 && var0.length == 6 && ((int[])((int[])var0[1])).length == 10) {
                  if(1 == var1) {
                     ((int[])((int[])var0[1]))[2] = (ipa.a(var2, var3 ^ 114) << 12) / 100;
                  } else if(var1 != 2) {
                     if(0 == var1) {
                        ((int[])((int[])var0[1]))[9] = jia.c(-8166, var2);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[3] = (ipa.a(var2, (int)-78) << 12) / 100;
                  }

               } else if(var0 != null && 25 == var0.length && ((int[])((int[])var0[1])).length == 2) {
                  if(0 != var1) {
                     if(1 == var1) {
                        ((boolean[])((boolean[])var0[3]))[0] = -2 == ~fh.a(var2, false);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
                  }

               } else if(var0 != null && var0.length == 25 && ((int[])((int[])var0[1])).length == 3) {
                  if(var1 != 0) {
                     if(var1 == 1) {
                        ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
                     }
                  } else {
                     ((int[])((int[])var0[1]))[1] = de.a(var3 + 11, var2);
                  }

               } else if(var0 != null && 26 == var0.length && ((int[])((int[])var0[1])).length == 1) {
                  gn.a(-24120, var1, var2, var0);
               } else if(null != var0 && var0.length == 19) {
                  tca.a(var0, var3 ^ 11, var2, var1);
               } else if(var0 != null && var0.length == 11 && ((int[])((int[])var0[1])).length == 6) {
                  wu.a(var1, 1, var2, var0);
               } else if(var0 != null && 11 == var0.length && ((int[])((int[])var0[1])).length == 2) {
                  if(var1 == 0) {
                     ((int[])((int[])var0[1]))[1] = (fh.a(var2, false) << 12) / 255;
                  }

               } else if(var0 != null && var0.length == 17 && ((int[])((int[])var0[1])).length == 3) {
                  rca.a(var0, var1, 2, var2);
               }
            }
         }
      }
   }

   static final Object b(int var0, Object[] var1) {
      if(var0 != -23) {
         d = (Object[])null;
      }

      ++e;

      wg var2;
      Object[] var8;
      for(Object[] var6 = null != (var2 = (wg)qt.a(0, (Object[])((Object[])var1[0])))?var2.t:null; null != var6; ((int[])((int[])var1[1]))[0] += ((int[])((int[])var8[1]))[0]) {
         Object var7 = cq.a((byte)81, var6);
         if(null != var7) {
            return var7;
         }

         var8 = var6;
         wg var3;
         var6 = null != (var3 = (wg)nda.a(1, (Object[])((Object[])var1[0])))?var3.t:null;
         ((lm)(null != var8?var8[0]:null)).a((byte)16);
         ((tha)(null != var8?var8[0]:null)).a(8192);
      }

      return null;
   }

   static final Object[] a(int var0, Object[] var1) {
      ++f;
      var1[1] = nb.a((byte)116, 128, new Object[5]);
      var1[0] = new int[((int[])((int[])nb.g[1]))[0]];
      if(var0 != 9548) {
         a(((float[])((float[])var1[1]))[13], ((float[])((float[])var1[14]))[23], 0.76630527F, (Object[])((Object[])var1[1]), ((int[])((int[])d[1]))[24], -0.020727277F);
      }

      var1[2] = new int[((int[])((int[])nb.g[1]))[0]];
      return var1;
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      if(((boolean[])((boolean[])var2[5]))[var3]) {
         nha.a((Object[])((Object[])var2[0]), 18806, 1);
         moa.a((byte)95, ((Object[][])((Object[][])var2[3]))[-1 + var0], (Object[])((Object[])var2[0]));
         nha.a((Object[])((Object[])var2[0]), 18806, 0);
      }

      ++c;
   }

}
